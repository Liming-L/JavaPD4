import java.util.HashMap;
import java.util.Scanner;

// 三级级联加密工具（固定文本+仅输入移位次数）
public class Main {
    // 固定待加密的罗马历史文本
    private static final String ORIGINAL_TEXT = """
            According to legend, Ancient Rome was founded by the two brothers, and demigods, Romulus and Remus, on 21 April 753 BCE. The legend claims that in an argument over who would rule the city (or, in another version, where the city would be located) Romulus killed Remus and named the city after himself. This story of the founding of Rome is the best known but it is not the only one.
            
            Other legends claim the city was named after a woman, Roma, who traveled with Aeneas and the other survivors from Troy after that city fell. Upon landing on the banks of the Tiber River, Roma and the other women objected when the men wanted to move on. She led the women in the burning of the Trojan ships and so effectively stranded the Trojan survivors at the site which would eventually become Rome. Aeneas of Troy is featured in this legend and also, famously, in Virgil's Aeneid, as a founder of Rome and the ancestor of Romulus and Remus, thus linking Rome with the grandeur and might which was once Troy.
            
            Still other theories concerning the name of the famous city suggest it came from Rumon, the ancient name for the Tiber River, and was simply a place name given to the small trading center established on its banks or that the name derived from an Etruscan word which could have designated one of their settlements.
            
            Early Rome
            Originally a small town on the banks of the Tiber, Rome grew in size and strength, early on, through trade. The location of the city provided merchants with an easily navigable waterway on which to traffic their goods. The city was ruled by seven kings, from Romulus to Tarquin, as it grew in size and power. Greek culture and civilization, which came to Rome via Greek colonies to the south, provided the early Romans with a model on which to build their own culture. From the Greeks they borrowed literacy and religion as well as the fundamentals of architecture.
            """;

    // 拉丁字母 → 西里尔字母映射表（覆盖A-Z/a-z）
    private static final HashMap<Character, Character> LATIN_TO_CYRILLIC = new HashMap<>();
    
    static {
        // 初始化映射（A-Z对应西里尔字符，a-z对应另一组西里尔字符）
        char[] latinUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] cyrillicUpper = "ѐёєћќѝљњѣѥѧѩѫѭѯѱѳѵѷѹѻѽѿѾѼѺѸѶѴѲѰѨѦ".toCharArray();
        char[] latinLower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] cyrillicLower = "ѐёєћќѝљњѣѥѧѩѫѭѯѱѳѵѷѹѻѽѿѾѼѺѸѶѴѲѰѨѦ".toLowerCase().toCharArray();
        
        // 填充大写字母映射
        for (int i = 0; i < latinUpper.length; i++) {
            LATIN_TO_CYRILLIC.put(latinUpper[i], cyrillicUpper[i % cyrillicUpper.length]);
        }
        // 填充小写字母映射
        for (int i = 0; i < latinLower.length; i++) {
            LATIN_TO_CYRILLIC.put(latinLower[i], cyrillicLower[i % cyrillicLower.length]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 仅获取用户输入的移位次数
        System.out.println("===== 三级级联加密工具 =====");
        System.out.print("请输入移位次数（整数，如3）：");
        int shift = scanner.nextInt();
        scanner.nextLine(); // 清空换行符
        
        // 2. 展示固定文本（可选，方便用户确认）
        System.out.println("\n===== 待加密的固定文本 =====");
        System.out.println(ORIGINAL_TEXT);
        
        // 3. 执行三级加密并展示每一步
        System.out.println("\n===== 加密过程展示 =====");
        // Level 1: 移位加密（按用户输入的次数移位）
        String level1Result = shiftEncrypt(ORIGINAL_TEXT, shift);
        System.out.printf("Level 1 (移位加密，移位%d次)：%n%s%n", shift, level1Result);
        
        // Level 2: 分割重组
        String level2Result = splitRecombine(level1Result);
        System.out.println("\nLevel 2 (分割重组，前半+后半互换)：");
        System.out.println(level2Result);
        
        // Level 3: 西里尔字母替换
        String finalResult = cyrillicEncrypt(level2Result);
        System.out.println("\nLevel 3 (西里尔字母替换)：");
        System.out.println(finalResult);
        
        // 4. 输出最终加密结果（单独展示）
        System.out.println("\n===== 最终加密结果 =====");
        System.out.println(finalResult);
        
        scanner.close();
    }

    /**
     * Level 1: 移位加密（凯撒密码）
     * @param text 固定文本
     * @param shift 用户输入的移位次数（正数右移，如3则A→D、B→E）
     * @return 移位加密结果
     */
    private static String shiftEncrypt(String text, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // 严格按用户输入的次数移位（如3次：A→D、B→E、C→F、D→G）
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int newCharCode = (c - base + shift) % 26;
                // 处理负数移位（如移位-1 → 25）
                if (newCharCode < 0) {
                    newCharCode += 26;
                }
                sb.append((char) (base + newCharCode));
            } else {
                // 非字母字符（数字、符号、空格、换行）保持不变
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Level 2: 分割重组（文本从中间分割，后半+前半拼接）
     * @param text 移位加密后的文本
     * @return 分割重组结果
     */
    private static String splitRecombine(String text) {
        if (text.isEmpty()) {
            return "";
        }
        int half = text.length() / 2;
        // 后半部分 + 前半部分（例如ABCD→CDAB，用户输入3时DEFG→FGDE）
        return text.substring(half) + text.substring(0, half);
    }

    /**
     * Level 3: 西里尔字母替换（拉丁字母→西里尔字母，非字母不变）
     * @param text 分割重组后的文本
     * @return 西里尔加密结果
     */
    private static String cyrillicEncrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            // 替换为西里尔字母，无映射则保持原字符
            sb.append(LATIN_TO_CYRILLIC.getOrDefault(c, c));
        }
        return sb.toString();
    }
}
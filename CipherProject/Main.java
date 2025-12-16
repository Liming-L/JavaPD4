import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o); }

  void init(){
    Scanner sc = new Scanner(System.in);

    // 1. 读取 original.txt 文件（保持文件读取逻辑）
    String msg = "";
    try {
      File file = new File("original.txt");
      msg = new String(Files.readAllBytes(file.toPath()));
    } catch (IOException e) {
      System.err.println("读取 original.txt 失败：" + e.getMessage());
      sc.close();
      return;
    }

    // 2. 获取用户输入的移位次数
    System.out.print("Enter a number to shift the cipher: ");
    int shift = sc.nextInt();
    sc.close();

    // ----- LEVEL 1 -----
    // 原始文本 → Level1加密
    String enc1 = cipher(msg, shift);
    print("Level1 Cipher: " + enc1);
    // Level1加密结果 → Level1解码（验证）
    String dec1 = decipher(enc1, shift);
    print("Level1 Decipher: " + dec1);

    // ----- LEVEL 2 -----
    // Level1加密结果 → Level2加密（核心逻辑：级联输入）
    String enc2 = splitEncode(enc1);
    print("Level2 SplitEncode: " + enc2);
    // Level2加密结果 → Level2解码（验证）
    String dec2 = splitDecode(enc2);
    print("Level2 SplitDecode: " + dec2);

    // ----- LEVEL 3 -----
    // Level2加密结果 → Level3加密（核心逻辑：级联输入）
    String enc3 = substitution(enc2);
    print("Level3 Substitution: " + enc3);
    // Level3加密结果 → Level3解码（验证）
    String dec3 = desubstitution(enc3);
    print("Level3 Desubstitution: " + dec3);

    // 已删除：Final Encrypted Text 和 Full Decrypted Text 相关输出
  }

  // ------------------------------------------------------------
  // LEVEL 1: CAESAR CIPHER ENCODE（原逻辑不变）
  // ------------------------------------------------------------
  String cipher(String txt, int shift){
    String bld="";
    for(int i=0; i<txt.length(); i++){
      char c = txt.charAt(i);
      if(Character.isUpperCase(c)){
        bld += (char)('A' + (c - 'A' + shift) % 26);
      } else if(Character.isLowerCase(c)){
        bld += (char)('a' + (c - 'a' + shift) % 26);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  // ------------------------------------------------------------
  // LEVEL 1: CAESAR CIPHER DECODE（原逻辑不变）
  // ------------------------------------------------------------
  String decipher(String txt, int shift){
    String bld="";
    for(int i=0; i<txt.length(); i++){
      char c = txt.charAt(i);
      if(Character.isUpperCase(c)){
        bld += (char)('A' + (c - 'A' - shift + 26) % 26);
      } else if(Character.isLowerCase(c)){
        bld += (char)('a' + (c - 'a' - shift + 26) % 26);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  // ------------------------------------------------------------
  // LEVEL 2: SPLIT ENCODE（原逻辑不变）
  // ------------------------------------------------------------
  String splitEncode(String txt){
    int mid = txt.length()/2;
    return txt.substring(mid) + txt.substring(0, mid);
  }

  // ------------------------------------------------------------
  // LEVEL 2: SPLIT DECODE（原逻辑不变）
  // ------------------------------------------------------------
  String splitDecode(String txt){
    int mid = txt.length()/2;
    return txt.substring(txt.length()-mid) + txt.substring(0, txt.length()-mid);
  }

  // ------------------------------------------------------------
  // LEVEL 3: SUBSTITUTION MAPPING TABLES（原映射表不变）
  // ------------------------------------------------------------
  char[] latinMap = {
    'A','B','C','D','E','F','G','H','I','J',
    'K','L','M','N','O','P','Q','R','S','T',
    'U','V','W','X','Y','Z'
  };

  char[] cyrillicMap = {
    'А','Б','Ц','Д','Є','Ф','Г','Н','І','Ј',
    'К','Л','М','Н','О','П','Ҁ','Р','С','Т',
    'У','В','Ш','Х','Ы','З'
  };

  // ------------------------------------------------------------
  // LEVEL 3: SUBSTITUTION ENCODE (case-preserving)（原逻辑不变）
  // ------------------------------------------------------------
  String substitution(String txt){
    String bld = "";

    for(int i=0; i<txt.length(); i++){
      char original = txt.charAt(i);
      char upper = Character.toUpperCase(original);
      char mapped = original;

      for(int j=0; j<latinMap.length; j++){
        if(upper == latinMap[j]){
          mapped = cyrillicMap[j];

          // Restore lowercase if original was lowercase
          if(Character.isLowerCase(original)){
            mapped = Character.toLowerCase(mapped);
          }
          break;
        }
      }
      bld += mapped;
    }
    return bld;
  }

  // ------------------------------------------------------------
  // LEVEL 3: SUBSTITUTION DECODE (case-preserving)（原逻辑不变）
  // ------------------------------------------------------------
  String desubstitution(String txt){
    String bld = "";

    for(int i=0; i<txt.length(); i++){
      char original = txt.charAt(i);
      char upper = Character.toUpperCase(original);
      char mapped = original;

      for(int j=0; j<cyrillicMap.length; j++){
        if(upper == cyrillicMap[j]){
          mapped = latinMap[j];

          // Restore lowercase if original was lowercase
          if(Character.isLowerCase(original)){
            mapped = Character.toLowerCase(mapped);
          }
          break;
        }
      }
      bld += mapped;
    }
    return bld;
  }
}
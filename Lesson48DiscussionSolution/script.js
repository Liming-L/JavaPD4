
let data;

async function init(){
  let link ="https://legendary-doodle-v6rv45jv475xh6wj-8500.app.github.dev/" ;
  let route="customers"
  info = await fetch(link+route);
  data = await info.json();

  //first dump the array to the console and examine 
  //the content
  console.log(data);

}
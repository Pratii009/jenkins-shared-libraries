def  call(String imagename,String imagetag,String dockerhubuser){
  sh "docker build -t ${dockerhubuser}/${imagename}:${imagetag} ."
}

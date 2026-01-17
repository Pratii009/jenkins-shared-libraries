def call (String imagename,String imagetag,String dockerhubuser){
   withCredentials([usernamePassword(credentialsId:"dockerhubcred",
                passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
   }
                sh "docker push ${dockerHubUser}/${imagename}:${imagetag}"
}

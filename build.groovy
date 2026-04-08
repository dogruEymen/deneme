node {


    String name = "Eymen"
    stage("Selamla"){
        
        println("Hello World ${name}")

        echo "hello"

        sh 'date'
    }
    
}
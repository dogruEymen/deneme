node {

    String NAME = params.NAME

    stage("Selamla"){
        
        println("Hello World ${NAME}")

        echo "hello"

        sh 'date'
    }
    
}
node {

    stage("Selamla"){
        
        println("Hello World ${params.NAME}")

        echo "hello"

        sh 'date'
    }
    
}
properties([
    pipelineTriggers([
        pollSCM('* * * * *') // Her dakika (Dakika Saat Gün Ay HaftanınGünü)
    ])
])

node {
    stage('Kontrol') {
        checkout scm // Bu satır kritik! (Açıklaması aşağıda)
        echo "Kontrol edildi: " + sh(script: 'date', returnStdout: true)
    }
}
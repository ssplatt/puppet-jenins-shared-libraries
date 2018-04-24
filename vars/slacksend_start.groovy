/* standard slack message for tests starting
 */

def call() {
  slackSend color: 'warning', message: "${env.JOB_NAME} #${env.BUILD_NUMBER} - tests started"
}

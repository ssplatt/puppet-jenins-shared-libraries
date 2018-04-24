/*
 * Handle successful completion of module tests
 */

def call () {
  stage ('Post tests success') {
    slacksend_success()
  }
}

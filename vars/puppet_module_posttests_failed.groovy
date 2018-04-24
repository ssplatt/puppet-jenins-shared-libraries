/*
 * Handle failure of puppet module tests
 */

def call () {
  stage ('Post tests failed') {
    slacksend_failure()
  }
}

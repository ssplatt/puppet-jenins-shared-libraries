/*
 * Standard module accpetance tests for a puppet module
 */

def call () {
  stage ('Acceptance Tests') {
    rvm 'bundle exec rake acceptance'
  }
}

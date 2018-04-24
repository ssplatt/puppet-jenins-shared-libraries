/*
 * Standard module lint tests for a puppet module
 */

def call () {
  stage ('Module Lint Tests') {
    rvm 'bundle exec rake lint'
  }
}

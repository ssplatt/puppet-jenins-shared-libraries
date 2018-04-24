/*
 * Standard syntax tests for a puppet module
 */

def call () {
  stage ('Module Syntax Tests') {
    rvm 'bundle exec rake syntax'
  }
}

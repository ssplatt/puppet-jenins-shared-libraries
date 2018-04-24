/*
 * Standard puppet validation tests for a puppet module
 */

def call () {
  stage ('Validation Tests') {
    rvm 'bundle exec rake validation'
  }
}

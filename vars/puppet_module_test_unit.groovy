/*
 * Standard unit tests for a puppet module
 */

def call () {
  stage ('Unit Tests') {
    rvm 'bundle exec rake spec'
  }
}

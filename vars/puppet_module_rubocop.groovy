/*
 * Standard rubocop tests for a puppet module
 */

def call () {
  stage ('Rubocop Tests') {
    rvm 'bundle exec rake rubocop'
  }
}

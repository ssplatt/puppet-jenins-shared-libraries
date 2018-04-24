/*
 * Standard metadata lint tests for a puppet module
 */

def call () {
  stage ('Metadata Lint Tests') {
    rvm 'bundle exec rake metadata_lint'
  }
}

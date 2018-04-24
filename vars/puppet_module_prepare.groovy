/*
 * Standard prepare env for testing puppet modules
 */

def call () {
  stage ('Checkout Code') {
    checkout scm
  }
  stage ('Install Gems') {
    rvm 'bundle install'
  }
}

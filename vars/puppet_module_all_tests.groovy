/*
 * Run standard puppet module tests
 * and handle test results
 */

def call () {
  ansiColor('xterm') {
    puppet_module_test_unit()
    puppet_module_test_acceptance()
  }
}

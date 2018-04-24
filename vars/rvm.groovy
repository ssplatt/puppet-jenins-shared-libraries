/* Small helper command to execute a `sh` step with RVM pre-loaded and our
 * proper Ruby selected
 */
def call(String commands) {
    sh "bash -c 'source ~/.rvm/scripts/rvm && rvm use 2.3.0 && ${commands}'"
}

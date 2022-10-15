Steps to reproduce:
1. ./gradlew --info compileKotlin  # this succeeds
2. echo "" >> src/main/kotlin/ICFailure.kt  # mutate file with no-op mutation to trigger incremental compilation
3. ./gradlew --info compileKotlin  # this fails when it should succeed

Steps to reproduce:
1. ./gradlew --info compileKotlin  # this succeeds
2. echo "" >> src/main/kotlin/ICFailure.kt  # mutate file with no-op mutation to trigger incremental compilation
3. ./gradlew --info compileKotlin  # this fails when it should succeed

Error message from incremental compilation:
e: path/to/20221015-incremental-compilation-failure/src/main/kotlin/ICFailure.kt: (4, 100): Cannot access class 'com.squareup.protos.cash.api.ResponseMetadata'. Check your module classpath for missing or conflicting dependencies

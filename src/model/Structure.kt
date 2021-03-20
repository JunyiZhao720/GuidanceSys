package model

interface Structure {
    val guidanceVersion: Double
    val version: Double
    val description: String
    val components: Map<String, Structure>
    // TODO: design analysis/history data structure
    // abstract val analysis: Map<Date, List<log?>>
    // abstract val history: Map<Date, ...?>
}
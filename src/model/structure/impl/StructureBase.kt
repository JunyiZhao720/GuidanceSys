package model.structure.impl

import model.record.AnalysisRecord
import model.record.HistoryRecord
import model.structure.Structure

abstract class StructureBaseInput {
    abstract val guidanceVersion: Double
    abstract val version: Double
    abstract val description: String
    abstract val components: Map<String, Structure>
    abstract val analysis: List<AnalysisRecord>
    abstract val history: List<HistoryRecord>
}

abstract class StructureBase(val baseInput: StructureBaseInput): Structure {


}
package model.structure.impl

import model.record.AnalysisRecord
import model.record.HistoryRecord
import model.structure.Structure
import model.structure.StrategyStructure

data class StrategyStructureInput(
    override val guidanceVersion: Double,
    override val version: Double,
    override val description: String,
    override val components: Map<String, Structure>,
    override val analysis: List<AnalysisRecord>,
    override val history: List<HistoryRecord> ): StructureBaseInput()

class StrategyStructureImpl(input: StrategyStructureInput): StructureBase(input), StrategyStructure {

}
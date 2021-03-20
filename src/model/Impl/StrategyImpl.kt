package model.Impl

import model.Structure
import model.Strategy

class StrategyImpl(
    override val guidanceVersion: Double,
    override val version: Double,
    override val description: String,
    override val components: Map<String, Structure>
): StructureBase(), Strategy {

}
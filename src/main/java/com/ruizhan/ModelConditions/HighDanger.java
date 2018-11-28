// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 11/28/2018 18:11:11
// ******************************************************* 
package com.ruizhan.ModelConditions;

/** ModelCondition class created from MMPM condition HighDanger. */
public class HighDanger extends jbt.model.task.leaf.condition.ModelCondition {

	/** Constructor. Constructs an instance of HighDanger. */
	public HighDanger(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a com.ruizhan.ExecutionConditions.HighDanger task that is able to
	 * run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new com.ruizhan.ExecutionConditions.HighDanger(this, executor,
				parent);
	}
}
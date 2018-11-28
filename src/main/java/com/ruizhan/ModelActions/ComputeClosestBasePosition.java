// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 11/28/2018 18:11:11
// ******************************************************* 
package com.ruizhan.ModelActions;

/** ModelAction class created from MMPM action ComputeClosestBasePosition. */
public class ComputeClosestBasePosition extends
		jbt.model.task.leaf.action.ModelAction {

	/** Constructor. Constructs an instance of ComputeClosestBasePosition. */
	public ComputeClosestBasePosition(jbt.model.core.ModelTask guard) {
		super(guard);
	}

	/**
	 * Returns a com.ruizhan.ExecutionActions.ComputeClosestBasePosition task
	 * that is able to run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new com.ruizhan.ExecutionActions.ComputeClosestBasePosition(
				this, executor, parent);
	}
}
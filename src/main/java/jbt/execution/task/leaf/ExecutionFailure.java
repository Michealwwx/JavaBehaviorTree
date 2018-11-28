/*
 * Copyright (C) 2012 Ricardo Juan Palma Durán
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jbt.execution.task.leaf;

import jbt.execution.core.BTExecutor;
import jbt.execution.core.BTExecutor.BTExecutorList;
import jbt.execution.core.ExecutionTask;
import jbt.execution.core.ITaskState;
import jbt.model.core.ModelTask;
import jbt.model.task.leaf.ModelFailure;

/**
 * An ExecutionFailure is the ExecutionTask that knows how to run a
 * ModelFailure.
 * 
 * @author Ricardo Juan Palma Durán
 * 
 */
public class ExecutionFailure extends ExecutionLeaf {
	/**
	 * Constructs an ExecutionFailure that knows how to run a ModelFailure.
	 * 
	 * @param modelTask
	 *            the ModelFailure to run.
	 * @param executor
	 *            the BTExecutor managing this ExecutionFailure.
	 * @param parent
	 *            the parent ExecutionTask.
	 */
	public ExecutionFailure(ModelTask modelTask, BTExecutor executor, ExecutionTask parent) {
		super(modelTask, executor, parent);
		if (!(modelTask instanceof ModelFailure)) {
			throw new IllegalArgumentException("The ModelTask must subclass "
					+ ModelFailure.class.getCanonicalName() + " but it inherits from "
					+ modelTask.getClass().getCanonicalName());
		}
	}

	/**
	 * Does nothing.
	 * 
	 * @see ExecutionTask#internalSpawn()
	 */
	protected void internalSpawn() {
		this.getExecutor().requestInsertionIntoList(BTExecutorList.TICKABLE, this);
	}

	/**
	 * Returns {@link ExecutionTask.Status#FAILURE}.
	 * 
	 * @see ExecutionTask#internalTick()
	 */
	protected ExecutionTask.Status internalTick() {
		return ExecutionTask.Status.FAILURE;
	}

	/**
	 * Returns null.
	 * 
	 * @see ExecutionTask#storeState()
	 */
	protected ITaskState storeState() {
		return null;
	}

	/**
	 * Returns null.
	 * 
	 * @see ExecutionTask#storeTerminationState()
	 */
	protected ITaskState storeTerminationState() {
		return null;
	}

	/**
	 * Does nothing.
	 * 
	 * @see ExecutionTask#restoreState(ITaskState)
	 */
	protected void restoreState(ITaskState state) {
	}

	/**
	 * Does nothing.
	 * 
	 * @see ExecutionTask#internalTerminate()
	 */
	protected void internalTerminate() {
	}
}

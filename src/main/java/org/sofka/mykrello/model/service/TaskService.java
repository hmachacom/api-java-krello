package org.sofka.mykrello.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.sofka.mykrello.model.domain.ColumnForBoardDomain;
import org.sofka.mykrello.model.domain.TaskDomain;
import org.sofka.mykrello.model.repository.BoardRepository;
import org.sofka.mykrello.model.repository.ColumnForBoardRepository;
import org.sofka.mykrello.model.repository.ColumnRepository;
import org.sofka.mykrello.model.repository.TaskRepository;
import org.sofka.mykrello.model.service.interfaces.TaskServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceInterface {

	@Autowired
	private LogService logService;

	@Autowired

	private BoardRepository boardRepository;

	@Autowired
	private ColumnRepository columnRepository;

	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private ColumnForBoardRepository columnForBoardRepository;

	@Override
	public List<TaskDomain> findAllTasksById(Integer idBoard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public TaskDomain findById(Integer id) {
		// TODO Auto-generated method stub
		var task = taskRepository.findById(id);
		return task.isPresent() ? task.get() : null;
	}

	/* (non-Javadoc)
	 * @see org.sofka.mykrello.model.service.interfaces.TaskServiceInterface#create(org.sofka.mykrello.model.domain.TaskDomain)
	 */
	@Override
	@Transactional
	public TaskDomain create(TaskDomain task) {
		// TODO Auto-generated method stub
		var newTask = taskRepository.save(task);
		return newTask;
	}

	@Override
	public TaskDomain update(Integer id, TaskDomain task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskDomain delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}

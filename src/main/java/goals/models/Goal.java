package goals.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="goal_entity")
@JsonIgnoreProperties 
public class Goal {
		
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	
	private String description;
	
	private Integer parentid;
	
	private String dueDate;
	
	private int estimatedWork;
	
	private int remainingWork;
	
	private String progress;
	
	private String justification;
	
	private String phase;
	
	private Boolean isCompleted;
	
	private Boolean isReoccuring;
	
	private int priority;
	
	private String idealOutcome;
	
	private String scope;
	
	private String blockingReason;
	
	private String replacement;
	
	private Boolean isDaily;
	
	
	@OneToMany(mappedBy="parentid")
	private List<Goal> children;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public int getEstimatedWork() {
		return estimatedWork;
	}
	public void setEstimatedWork(int estimatedWork) {
		this.estimatedWork = estimatedWork;
	}
	public int getRemainingWork() {
		return remainingWork;
	}
	public void setRemainingWork(int remainingWork) {
		this.remainingWork = remainingWork;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public Boolean getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Boolean getIsReoccuring() {
		return isReoccuring;
	}
	public void setIsReoccuring(Boolean isReoccuring) {
		this.isReoccuring = isReoccuring;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getIdealOutcome() {
		return idealOutcome;
	}
	public void setIdealOutcome(String idealOutcome) {
		this.idealOutcome = idealOutcome;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getBlockingReason() {
		return blockingReason;
	}
	public void setBlockingReason(String blockingReason) {
		this.blockingReason = blockingReason;
	}
	public String getReplacement() {
		return replacement;
	}
	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	public Boolean getIsDaily() {
		return isDaily;
	}
	public void setIsDaily(Boolean isDaily) {
		this.isDaily = isDaily;
	}
	public List<Goal> getChildren() {
		return children;
	}
	public void setChildren(List<Goal> children) {
		this.children = children;
	}
}

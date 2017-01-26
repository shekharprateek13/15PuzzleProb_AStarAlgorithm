package cs.ai.astar;

import java.util.Arrays;

/**
 * This class represents a Node of a A Star Search Algorithm. 
 * A node consists of following items:
 * STATE: the state of the 15 puzzle board game at any given point in time.
 * PARENT: the parent of a particular Node.
 * ACTION: the action associated with the Parent Node which resulted in the state of this Node.
 * PATH_COST: the sum of step costs associated while reaching to this Node the graph. 
 * NODE_LEVEL: the depth of each node while traversing the tree.
 * @author Akhauri Prateek Shekhar
 */
public class Node {
	
	private Tile[][] STATE;
	private Node PARENT;
	private Constant.ACTION ACTION;
	private Integer PATH_COST;
	private Integer NODE_LEVEL;
	private Integer G_FUNCT;
	private Integer H_FUNCT;
	private Integer F_FUNCT;

	public Node() {
		super();
	}
	
	public Node(Tile[][] STATE,Node PARENT,Constant.ACTION ACTION,Integer PATH_COST,Integer G_FUNCT,Integer H_FUNCT,Integer F_FUNCT) {
		super();
		this.STATE = STATE;
		this.PARENT = PARENT;
		this.ACTION = ACTION;
		this.PATH_COST = PATH_COST;
		this.G_FUNCT = G_FUNCT;
		this.H_FUNCT =H_FUNCT;
		this.F_FUNCT = F_FUNCT;
	}

	public Tile[][] getSTATE() {
		return STATE;
	}

	public void setSTATE(Tile[][] sTATE) {
		STATE = sTATE;
	}

	public Node getPARENT() {
		return PARENT;
	}

	public void setPARENT(Node pARENT) {
		PARENT = pARENT;
	}

	public Constant.ACTION getACTION() {
		return ACTION;
	}

	public void setACTION(Constant.ACTION aCTION) {
		ACTION = aCTION;
	}

	public Integer getPATH_COST() {
		return PATH_COST;
	}

	public void setPATH_COST(Integer pATH_COST) {
		PATH_COST = pATH_COST;
	}

	public Integer getNODE_LEVEL() {
		return NODE_LEVEL;
	}

	public void setNODE_LEVEL(Integer nODE_LEVEL) {
		NODE_LEVEL = nODE_LEVEL;
	}

	public Integer getG_FUNCT() {
		return G_FUNCT;
	}

	public void setG_FUNCT(Integer g_FUNCT) {
		G_FUNCT = g_FUNCT;
	}

	public Integer getH_FUNCT() {
		return H_FUNCT;
	}

	public void setH_FUNCT(Integer h_FUNCT) {
		H_FUNCT = h_FUNCT;
	}

	public Integer getF_FUNCT() {
		return F_FUNCT;
	}

	public void setF_FUNCT(Integer f_FUNCT) {
		F_FUNCT = f_FUNCT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(STATE);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (!Arrays.deepEquals(STATE, other.STATE))
			return false;
		return true;
	}
}
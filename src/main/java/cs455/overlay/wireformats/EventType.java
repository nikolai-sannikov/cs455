package cs455.overlay.wireformats;

public enum EventType {
	REGISTER_REQUEST, REGISTER_RESPONSE, DEREGISTER_REQUEST, DEREGISTER_RESPONSE,
	MESSAGING_NODES_LIST, LINK_WEIGHTS,
	TASK_INITIATE, MESSAGE,
	TASK_COMPLETE,
	PULL_TRAFFIC_SUMMARY, TRAFFIC_SUMMARY
}

package com.python.pv;

public class MyPythonVisitor implements MyPythonGrammarVisitor{

	@Override
	public Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		//System.out.println(node.id);
		switch(node.id) {
		case MyPythonGrammarTreeConstants.JJTSTART:
			node.ModifyGrammer();
			node.childrenAccept(this, data);				
			break;
		case MyPythonGrammarTreeConstants.JJTBIGER:
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
			((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTCONDITION:
			node.childrenAccept(this, data);	
			break;
		case MyPythonGrammarTreeConstants.JJTELSESTATE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTEQSTATE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTEQU:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTFENHAO:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTFIRSTASSIGN:
			node.childrenAccept(this, data);	
			break;
		case MyPythonGrammarTreeConstants.JJTFIRSTPARA:
			node.childrenAccept(this, data);	
			break;
		case MyPythonGrammarTreeConstants.JJTHEADPARA:
			node.childrenAccept(this, data);	
			break;
		case MyPythonGrammarTreeConstants.JJTIDENTIFIER:
			node.childrenAccept(this, data);
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTIF:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTINTEGER:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;  
		case MyPythonGrammarTreeConstants.JJTNOTEQ:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSECONDPARA:
			node.childrenAccept(this, data);	
			//((StringBuffer) data).append(node.jjtGetValue());
		  // ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSMALLER:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSOCKETBIND:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
	/*	case MyPythonGrammarTreeConstants.JJTSOCKETCLOSE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSOCKETHTTP:
			//node.deletehttp();
			node.childrenAccept(this, data);	
			break; 
		case MyPythonGrammarTreeConstants.JJTSOCKETLISTEN:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;x
		case MyPythonGrammarTreeConstants.JJTSOCKETMETHOD:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;*/
		case MyPythonGrammarTreeConstants.JJTTHIRDPARA:
			//node.deletehttp();
			node.childrenAccept(this, data);	
			//((StringBuffer) data).append(node.jjtGetValue());
		   // ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTWHILETRUE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		/*case MyPythonGrammarTreeConstants.JJTCREATESOCKET:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTCLOSESOCKET:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTGETHOSTNAME:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTGETPORT:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;*/
		case MyPythonGrammarTreeConstants.JJTIMPORTPACKGE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTPOINTMETHOD:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
	/*	case MyPythonGrammarTreeConstants.JJTREVECMSG:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;  */
		case MyPythonGrammarTreeConstants.JJTSOCKETLP:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSOCKETRP:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTSOCKETTRUE:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break;
		case MyPythonGrammarTreeConstants.JJTCLIENTIMPORT:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTCOMMAFUN:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTCOMMASTATE:
			
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTFORTHPARA:
			node.childrenAccept(this, data);	
			//((StringBuffer) data).append(node.jjtGetValue());
		   // ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTGETSOCKETHOST:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTOUTBAND:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTSOCKETLETTER:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
		case MyPythonGrammarTreeConstants.JJTSOCKETCOMMA:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		   ((StringBuffer) data).append(" ");
			break; 
			
		case MyPythonGrammarTreeConstants.JJTSERVERIMPORT:
			node.childrenAccept(this, data);	
			((StringBuffer) data).append(node.jjtGetValue());
		    ((StringBuffer) data).append(" ");
			break; 
			
		}				
		return data;
	}

	
}


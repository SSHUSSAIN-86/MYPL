
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\004\014\000\002\004" +
    "\007\000\002\002\004\000\002\002\003\000\002\003\005" +
    "\000\002\003\006\000\002\003\007\000\002\003\007\000" +
    "\002\005\003\000\002\005\005\000\002\006\003\000\002" +
    "\006\003\000\002\006\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\006\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\022\005\001\002\000\004\002\067\001" +
    "\002\000\004\006\006\001\002\000\014\004\010\014\015" +
    "\020\011\023\014\026\007\001\002\000\004\017\064\001" +
    "\002\000\012\004\010\014\015\020\011\026\007\001\002" +
    "\000\004\015\051\001\002\000\004\025\047\001\002\000" +
    "\020\004\010\005\ufffd\014\015\020\011\024\ufffd\025\ufffd" +
    "\026\007\001\002\000\004\006\037\001\002\000\010\015" +
    "\017\026\016\027\021\001\002\000\022\006\ufff5\007\ufff5" +
    "\010\ufff5\011\ufff5\012\ufff5\013\ufff5\016\ufff5\021\ufff5\001" +
    "\002\000\010\015\017\026\016\027\021\001\002\000\016" +
    "\006\024\007\023\010\025\011\027\012\026\013\022\001" +
    "\002\000\022\006\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6" +
    "\013\ufff6\016\ufff6\021\ufff6\001\002\000\010\015\017\026" +
    "\016\027\021\001\002\000\010\015\017\026\016\027\021" +
    "\001\002\000\020\004\ufffc\005\ufffc\014\ufffc\020\ufffc\024" +
    "\ufffc\025\ufffc\026\ufffc\001\002\000\010\015\017\026\016" +
    "\027\021\001\002\000\010\015\017\026\016\027\021\001" +
    "\002\000\010\015\017\026\016\027\021\001\002\000\022" +
    "\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2\013\022\016" +
    "\ufff2\021\ufff2\001\002\000\022\006\ufff1\007\ufff1\010\ufff1" +
    "\011\ufff1\012\ufff1\013\022\016\ufff1\021\ufff1\001\002\000" +
    "\022\006\ufff3\007\ufff3\010\ufff3\011\027\012\026\013\022" +
    "\016\ufff3\021\ufff3\001\002\000\022\006\ufff4\007\ufff4\010" +
    "\ufff4\011\027\012\026\013\022\016\ufff4\021\ufff4\001\002" +
    "\000\022\006\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0\013" +
    "\ufff0\016\ufff0\021\ufff0\001\002\000\016\007\023\010\025" +
    "\011\027\012\026\013\022\016\036\001\002\000\022\006" +
    "\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013\uffef\016\uffef" +
    "\021\uffef\001\002\000\012\004\010\014\015\020\011\026" +
    "\007\001\002\000\004\024\041\001\002\000\004\006\042" +
    "\001\002\000\012\004\010\014\015\020\011\026\007\001" +
    "\002\000\004\025\044\001\002\000\004\006\045\001\002" +
    "\000\004\002\000\001\002\000\010\005\ufffe\024\ufffe\025" +
    "\ufffe\001\002\000\004\006\050\001\002\000\004\002\uffff" +
    "\001\002\000\010\015\017\026\016\027\021\001\002\000" +
    "\004\016\056\001\002\000\020\007\023\010\025\011\027" +
    "\012\026\013\022\016\ufff8\021\054\001\002\000\010\015" +
    "\017\026\016\027\021\001\002\000\004\016\ufff7\001\002" +
    "\000\004\006\057\001\002\000\020\004\ufff9\005\ufff9\014" +
    "\ufff9\020\ufff9\024\ufff9\025\ufff9\026\ufff9\001\002\000\004" +
    "\005\061\001\002\000\010\015\017\026\016\027\021\001" +
    "\002\000\016\006\063\007\023\010\025\011\027\012\026" +
    "\013\022\001\002\000\020\004\ufffa\005\ufffa\014\ufffa\020" +
    "\ufffa\024\ufffa\025\ufffa\026\ufffa\001\002\000\010\015\017" +
    "\026\016\027\021\001\002\000\016\006\066\007\023\010" +
    "\025\011\027\012\026\013\022\001\002\000\020\004\ufffb" +
    "\005\ufffb\014\ufffb\020\ufffb\024\ufffb\025\ufffb\026\ufffb\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\004\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\002\011\003\012\001\001\000\002" +
    "\001\001\000\006\002\057\003\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\002\045\003\012\001\001" +
    "\000\002\001\001\000\004\006\017\001\001\000\002\001" +
    "\001\000\004\006\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\033\001\001\000\004\006\032\001" +
    "\001\000\002\001\001\000\004\006\031\001\001\000\004" +
    "\006\030\001\001\000\004\006\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\002\037\003\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\042\003\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\005\051\006" +
    "\052\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\054\006\052\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 scanner.init();              
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return scanner.next_token(); 
    }


  public static void main(String args[]) throws java.io.IOException {
   parser parser_obj = new parser();
   Symbol parse_tree = null;
   try { parse_tree = parser_obj.parse(); }
   catch (Throwable e) {        e.printStackTrace();
        throw new Error(e.toString());
 };
}
        

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {

 


/**** interpStm ****/

/* This method a takes member of the statement class s
and a current table t and returns the table updated by s
(although some statements such as 'print' may not update the table).
It branches depending on what is the outermost constructor of s:
-If s is a print, it calls the method printList
with the list of expressions as first arg, and the current
table as second.  Print does NOT change the table.
-If s is an assignment, it returns the table value of the method
`update' when called with the current table, the assignment's
LHS, and the value of the RHS calcuated in the current table 
(note evaluating the RHS itself can't change the current table).
-If s is one statement s1 following by another s2, s2 is interpreted
in the table got by interpreting s1 in the current table t.
otherwise we have an error.  
-If s is a repeat statement, it returns the table after the
repeat's statements have been executed one or more times */

 Table interpStm(Stm s, Stm r, Table t) {  
   if (s instanceof PrintStm)  
     {  printList(s.getExps(), t);
        return t;
     }
   else if (s instanceof AssignStm)
        return update(t,s.getLHS(),interpExp(s.getRHS(), t));
   else if (s instanceof CompoundStm)
        return interpStm(s.get2(), r, interpStm(s.get1(),r,t));
   else if (s instanceof CallStm)
        return interpStm(r, r, t);
   else if (s instanceof RepeatStm)
/* first change table to simulate execution of stms inside repeat.. */
      {  Table table_temp = interpStm(s.getRepStm(),r,t);   
/* find value of e in new table.. */
         int   int_temp = interpExp(s.getRepExp(),table_temp);
/* call statements again if expression is non-zero */
         if (int_temp == 0) return table_temp; else
         return interpStm(s, r, table_temp); }
   else 
        System.out.println("error in stm");
        return t;
  }

/**** interpExp ****/

/* interpExp takes an expression e and a table t and returns the
value of e within the context of t.
-If e is a number return that number.
-If e is an identifier, return the looked up value of id in table t.
-If e is a binary operator expression:
  get the value of the left expression and
  get the value of the right expression 
 return the value of the right and left expressions
 operated on by whatever binary operator we have.
otherwise we have an error */

 int interpExp(Exp e, Table t) {
  if (e instanceof NumExp) 
       return e.getInt();
  else if (e instanceof IdExp) 
       return lookup(t,e.geteid());
  else if (e instanceof OpExp)
         {
            int   i_temp1 = interpExp(e.getleft(),t);
            int   i_temp2 = interpExp(e.getright(),t);
          if (e.getoper() == 1) 
           return (i_temp1+i_temp2); 
          else if (e.getoper() == 2) 
           return (i_temp1 - i_temp2); 
          else if (e.getoper() == 3) 
           return (i_temp1 * i_temp2); 
          else if (e.getoper() == 4) 
           return (i_temp1 / i_temp2); 
          else if (e.getoper() == 5 && i_temp1 > i_temp2) 
           return (1); 
          else if (e.getoper() == 5 && i_temp1 == i_temp2) 
           return (0); 
          else if (e.getoper() == 5 && i_temp1 < i_temp2) 
           return (0); 
          else throw new Error("error in Exp");
        }
  else throw new Error("Exp not recognised");
  }

/**** update ****/

/* constructor for a Table that implements the table
-- it simply adds the pair str, i to the old table t,
where str is the identifier and i the int value. */


 Table update(Table t,String str, int i) {
  return (new Table(str, i, t));}

/* selector for a Table - returns the integer value
associated with key once its found */


 int lookup(Table t, String key) {
  if (key == t.getid())
        return t.getint();
  else return lookup(t.gettail(),key);
  }


/* This class represents the Store of the program */

class Table {
  String id; int value; Table tail;
  Table(String i, int v, Table t)  {id =i; value=v; tail=t;}

  public String getid() {return id;}
  public int getint() {return value;}
  public Table gettail() {return tail;}
}


void  printList(ExpList expL, Table t) {
  if (expL instanceof PairExpList) 
     { 
       System.out.print(interpExp(expL.gethead(),t));
       System.out.print(" ");
       printList(  expL.gettail(), t );
      }
   else 
      /* exp is LastExpList */
              System.out.println(interpExp(expL.gethead(),t));
  }

/* The following classes represent the syntax classes of
   the language. They have constructirs and accesssors */

abstract class Stm { 
   protected ExpList getExps() {return null;}; 
   protected Stm get1() {return null;};
   protected Stm get2() {return null;};
   protected Exp getRHS() {return null;};
   protected String getLHS() {return null;};
   protected Stm getRepStm() {return null;};
   protected Exp getRepExp() {return null;};
}

class CompoundStm extends Stm {
   Stm stm1, stm2;
   CompoundStm(Stm s1, Stm s2) {stm1=s1; stm2=s2;}

   public Stm get1() {return stm1;}
   public Stm get2() {return stm2;}
}

class CallStm extends Stm {
    Exp exp;
    CallStm(Exp e) {exp =e; }
}

class AssignStm extends Stm {
   String id; Exp exp;
   AssignStm(String i, Exp e) {id=i; exp=e;}
   
   public Exp getRHS() {return exp;}
   public String getLHS() {return id;}
}

class PrintStm extends Stm {
   ExpList exps;
   PrintStm(ExpList e) {exps=e;}

   public ExpList getExps() {return exps;}
}
class RepeatStm extends Stm {
   Stm s; Exp exp;
   RepeatStm(Stm a, Exp e) {s=a; exp=e;}

   public Stm getRepStm() {return s;}
   public Exp getRepExp() {return exp;} 
}

abstract class Exp {
   protected int getInt() { return 0;};
   protected String geteid() {return null;};
   protected Stm getStm()   {return null;}; 
   protected Exp getExp() {return null;};
   protected int getoper() {return 0;}
   protected Exp getleft() {return null;}
   protected Exp getright() {return null;}

   }

class IdExp extends Exp {
   String id;
   IdExp(String i) {id=i;}
   public String geteid() {return id;}  
}

class NumExp extends Exp {
   int num;
   NumExp(int n) {num=n;}
   public int getInt() {return num;}
}

class OpExp extends Exp {
   Exp left, right; int oper;
   final static int Plus=1,Minus=2,Times=3,Div=4,Gthan=5;
   OpExp(Exp l, int o, Exp r) {left=l; oper=o; right=r;}
   public int getoper() {return oper;}
   public Exp getleft() {return left;}
   public Exp getright() {return right;}
}

abstract class ExpList { 
   abstract Exp gethead() ;
   protected ExpList gettail() {return null;};
}

class PairExpList extends ExpList {
   Exp head; ExpList tail;
   PairExpList(Exp h, ExpList t) {head=h; tail=t;}

   public ExpList gettail() {return tail;}
   public Exp gethead() {return head;}
}

class LastExpList extends ExpList {
   Exp head; 
   LastExpList(Exp h) {head=h;}

   public Exp gethead() {return head;}
}
            
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Table start_val = (Table)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= START SEMI FUNCTION SEMI stm END SEMI stm FINISH SEMI 
            {
              Table RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Stm r = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Stm s = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = interpStm(s,r,new Table("",0,null)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // prog ::= START SEMI stm FINISH SEMI 
            {
              Table RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Stm s = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = interpStm(s,null,new Table("",0,null)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stm ::= single_stm stm 
            {
              Stm RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Stm s1 = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Stm s2 = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new CompoundStm(s1,s2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stm ::= single_stm 
            {
              Stm RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Stm s1 = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // single_stm ::= CALL exp SEMI 
            {
              Stm RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new CallStm(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("single_stm",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // single_stm ::= ID ASSIGNS exp SEMI 
            {
              Stm RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new AssignStm(id,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("single_stm",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // single_stm ::= DO stm WHILE exp SEMI 
            {
              Stm RESULT =null;
		int s1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Stm s1 = (Stm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new RepeatStm(s1,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("single_stm",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // single_stm ::= PRINT LPAREN exps RPAREN SEMI 
            {
              Stm RESULT =null;
		int esleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int esright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpList es = (ExpList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new PrintStm(es); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("single_stm",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exps ::= exp 
            {
              ExpList RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LastExpList(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exps",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exps ::= exp COMMA exps 
            {
              ExpList RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int esleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int esright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpList es = (ExpList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new PairExpList(e,es); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exps",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= INT 
            {
              Exp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NumExp(n.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= ID 
            {
              Exp RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = new IdExp(id);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= exp PLUS exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(e1,OpExp.Plus,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= exp MINUS exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(e1,OpExp.Minus,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= exp TIMES exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(e1,OpExp.Times,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= exp DIVIDE exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(e1,OpExp.Div,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= exp GT exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(e1,OpExp.Gthan,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= LPAREN exp RPAREN 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}


public class ImmovableBlock extends Piece 
{

	@Override
	public void moveTo(Direction dir) {
		// TODO Auto-generated method stub
		
	}
	
	// Visitor pattern
	@Override
	public void accept(Piece p) 
	{
		p.visit(this);		
	}

	@Override
	public void visit(Rat rat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Cat cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MovableBlock movBlock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ImmovableBlock immoBlock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(EmptyBlock empty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Cheese cheese) {
		// TODO Auto-generated method stub
		
	}


}

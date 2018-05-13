package drawing;

import java.util.ArrayList;

public class PolyLine {

	private ArrayList<Point> points = new ArrayList<>();
	
	public PolyLine(Line line) {
		addLine(line);
	}

	public PolyLine() {
	}

	public void addPoint(Point point) {
		points.add(point);		
	}

	public String toString(){
		return points.toString();
	}

	public void addLine(Line line) {
		points.add(line.getP1());
		points.add(line.getP2());
	}

	public double length() {
		double length = 0;
		for (int i=1; i < points.size(); i++){
			length += points.get(i).distanceFromPoint(points.get(i-1));
		}
		return length;
	}

	public void addPolyLine(PolyLine polyLine1) {
		points.addAll(polyLine1.points);
		
	}

	public PolyLine reverse() {
		PolyLine polyLine = new  PolyLine();
		for (int i=points.size()-1; i  >= 0; i--){
			polyLine.addPoint(points.get(i));
		}
		return polyLine;
	}
}

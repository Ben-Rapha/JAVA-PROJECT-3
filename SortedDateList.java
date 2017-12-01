
package project3;

/**
 *
 * @author KINGSLEY OTTO
 */
public class SortedDateList extends DateList {
    public void add(Date212 date) {
	DateNode node = new DateNode(date);
	DateNode previous = first;
		
	while((previous.next != null) && (previous.next.data.compareTo(date) <= 0)){
            previous = previous.next;
		}
           
            node.next = previous.next;
            previous.next = node;
		
            if(node.next == null){
		last = node;
            }
            ++length;
           
        
	}
    
}

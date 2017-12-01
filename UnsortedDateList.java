
package project3;

/**
 *
 * @author KINGSLEY OTTO
 */
public class UnsortedDateList extends DateList {
      //APPEND MOETHOD PLACES DATES IN LINKEDLIST IN UNSORTED FORM
        public void add(Date212 date){
	DateNode node = new DateNode(date);
	last.next = node;
	last = node;
	++length;
    }
    
}

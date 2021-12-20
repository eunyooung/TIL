## List Collection (ArrayList, LinkedList, Vector)

- boolean add(E element) : 객체를 맨 끝에 추가하고 성공여부 반환
- void add(int index, E element) : 객체를 주어진 인덱스에 추가
- boolean remove(int index) : 해당 인덱스 위치의 객체를 삭제하고 성공여부를 반환
- E remove(int index) : 해당 인덱스 위치의 객체를 삭제하고 반환
- void clear() : 저장된 모든 객체를 삭제
- E set(int index, E element) : 해당 인덱스에 위치한 객체를 들어온 객체로 교체, 기존 객체를 반환
- E get(int index) : 해당 인덱스에 위치한 객체를 반환
- boolean contains(E element) : 리스트에 객체가 존재하는지 찾음
- boolean isEmpty() : 리스트가 비어있는지 반환
- int size() : 사이즈를 리턴

<br>

## Set Collection (HashsSet, TreeSet, LinkedHashSet)

- boolean add(E element) : 주어진 객체를 저장
- boolean remove(E element) : 해당 객체를 삭제
- void clear() : 저장된 모든 객체를 삭제
- boolean contains(E element) : 세트에 객체가 존재하는지 찾음
- boolean isEmpty() : 세트가 비어있는지 반환
- int size() : 사이즈를 리턴
- Iterator iterator() : set 컬렉션에 저장된 객체를 가져오는 반복자를 반환

<br>

## Map Collection (HashMap, Hashtable, Properties, TreeMap)

- E put(K element, E element) : 주어진 K 객체를 키로, E 객체를 값으로 추가, 성공 시 E 객체를 반환
- boolean containsKey(E element) : 해당 객체를 Key로하는 객체 존재 여부를 반환
- boolean containsValue(E element) : 해당 객체를 값으로 하는 객체가 맵에 존재 하는지 반환
- E get(V key : 맵에서 해당 key객체를 찾아 값을 반환
- boolean isEmpty() : 맵이 비었는지 확인
- set keySet() : 모든 key 객체를 set 객체에 담아 반환
- int size() : 사이즈를 반환
- Collection values() : 저장된 모든 값을 담아 반환
- void clear() : 모든 데이터를 제거
- E remove(E key) : 해당 key객체를 가지는 부분을 제거

<br>

## Stack
- LIFO
- push (E element) : 주어진 객체를 스택에 넣음
- peek() : 마지막에 들어간 객체를 반환
- pop() : 마지막에 들어간 객체를 제거하고 반환

## Queue
- FIFO
- offer(E element) : 주어진 객체를 넣음
- peek() : 객체 하나를 가지고 옴
- poll(): 객체 하나를 가지고 오고 큐에서 제거
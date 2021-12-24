## **Q1 자바의 컬렉션 프레임워크에 대한 설명으로 틀린 것은 무엇입니까?**
1. List 컬렉션은 인덱스로 객체를 관리하며 중복 저장을 허용한다.
2. Set 컬렉션은 순서를 유지하지 않으며 중복 저장을 허용하지 않는다.
3. Map 컬렉션은 키와 값으로 구성된 Map.Entry를 저장한다.
4. Stack은 FIFO(선입선출) 자료구조를 구현한 클래스이다.

**정답:**
```
4: Stack은 LIFO 자료구조를 구현한 클래스이다.
```


</br>

## **Q2 List 컬렉션에 대한 설명 중 틀린 것은 무엇입니까?**
1. 대표적인 구현 클래스로는 ArrayList, Vector, LinkedList가 있다.
2. 멀티 스레드 환경에서는 ArrayList보다 Vector가 스레드에 안전하다.
3. ArrayList에서 객체를 삭제하면 삭제된 위치는 비어 있게 된다.
4. 중간 위치에 객체를 빈번히 삽입하거나 제거할 경우 LinkedList를 사용하는 것이 좋다

**정답:**
```
3
```

</br>

## **Q3. Set 컬렉션에 대한 설명 중 틀린 것은 무엇입니까?**
1. 대표적인 구현 클래스로는 HashSet, LinkedHashSet, TreeSet이 있다.
2. Set 컬렉션에서 객체를 하나씩 꺼내오고 싶다면 Iterator를 이용한다.
3. HashSet은 hashCode()와 equals()를 이용해서 중복된 객체를 판별한다.
4. Set컬렉션에는 null을 저장할 수 없다.

**정답:**
```
4
```


</br>

## **Q4 Map 컬렉션에 대한 설명 중 틀린 것은 무엇입니까?**
1. 대표적인 구현 클래스로는 HashMap, HashTable, TreeMap, Properties가 있다.
2. HashMap과 HashTable은 hashCode()와 equals() 를 이용해서 중복 키를 판별한다.
3. 멀티 스레드 환경에서는 HashTable보다는 HashMap이 스레드에 안전하다.
4. Properties는 키와 값이 모두 String 타입이다.

**정답:**  
```
3
```

</br>

 # 컬렉션 프레임워크(Collection Framework)

</br>

## **Q5 컬렉션 프레임워크(Collection Framework)**
1. ( ____ )의 단점을 보안하기 위해 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 java.util 패키지에 컬렉션과 관련된 인터페이스와 클래스들을 포함시켜 놓은 것
2. (컬렉션 : 객체를 수집해서 저장하는 역할 / 프레임워크 : 사용 방법을 미리 정해 놓은 라이브러리)

**정답:**  
```
배열
```

</br>

**List 컬렉션에는 ArrayList, Vector, LinkedList 등이 있으며, 다음은 List 컬렉션에서 공통적으로 사용 가능한 List 인터페이스의 메소드들이다. (인덱스로 객체를 관리하기 때문에 인덱스를 매개값으로 갖는 메소드가 많음)**

</br>

## **Q6 Collection Framework Methods**
|인터페이스 분류|특징|구현 클래스|
|:---:|:---:|:---:|
|Collection - ( ____ )|순서를 유지하고 저장</br>중복 저장 가능|ArrayList, Vector, LinkedList|
|Collection - ( ____ )|순서를 유지하지 않고 저장</br>중복 저장 안됨|HashSet, TreeSet|
|( ____ )|키와 값의 쌍으로 저장</br>키는 중복 저장 안 됨|HashMape, Hashtable, TreeMap, Properties|

</br>

**정답:**
|인터페이스 분류|특징|구현 클래스|
|:---:|:---:|:---:|
|Collection - List)|순서를 유지하고 저장</br>중복 저장 가능|ArrayList, Vector, LinkedList|
|Collection - Set|순서를 유지하지 않고 저장</br>중복 저장 안됨|HashSet, TreeSet|
|Map|키와 값의 쌍으로 저장</br>키는 중복 저장 안 됨|HashMape, Hashtable, TreeMap, Properties|

</br>
</br>

# List 컬렉션
- 객체를 일렬로 늘어놓은 구조를 가지고 있음
- 객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공
- List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조함
- 동일한 객체에 중복 저장 가능, 이 경우 동일한 범지가 참조됨
- null도 저장이 가능, 이 경우 해당 인덱스는 객체를 참조하지 않음

</br>

## **Q7 List Collection Methods**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가||주어진 객체를 맨 끝에 추가|
|객체 추가|void add(int index, E element)|주어진 인덱스에 객체를 추가|
|객체 추가||주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈|
|객체 검색|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
|객체 검색||주어진 인덱스에 저장된 객체를 리턴|
|객체 검색||컬렉션이 비어 있는지 조사|
|객체 검색||저장되어 있는 전체 객체 수를 리턴|
|객체 삭제||저장된 모든 객체를 삭제|
|객체 삭제|E remove(int index)|주어진 인덱스에 저장된 객체를 삭제|
|객체 삭제|boolean remove(Object o)|주어진 객체를 삭제|

</br>

**정답:**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가|boolean add(E e)|주어진 객체를 맨 끝에 추가|
|객체 추가|void add(int index, E element)|주어진 인덱스에 객체를 추가|
|객체 추가|E set(int index, E element)|주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈|
|객체 검색|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
|객체 검색|E get(int index)|주어진 인덱스에 저장된 객체를 리턴|
|객체 검색|boolean isEmpty()|컬렉션이 비어 있는지 조사|
|객체 검색|int size()|저장되어 있는 전체 객체 수를 리턴|
|객체 삭제|void clear()|저장된 모든 객체를 삭제|
|객체 삭제|E remove(int index)|주어진 인덱스에 저장된 객체를 삭제|
|객체 삭제|boolean remove(Object o)|주어진 객체를 삭제|

</br>

### ArrayList
- ArrayList에 객체를 추가하면 객체가 인덱스로 관리됨
- 일반 배열과 인덱스로 객체를 관리한다는 점에서는 유사
= 배열은 생성할 때 크기가 고정되고 사용 중 크기를 변경할 수 없지만, ArrayList는 저장용량(capacity)을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어남

### Vector
- ArrayList와 동일한 내부 구조를 가지고 있음
- Vector를 생성하기 위해서는 저장할 객체 타입을 타입 파라미터로 표기하고 기본 생성자를 호출
- ArrayList와 다른 점은 Vector는 동기화된(synchronized) 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있음
- 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있음 -> 스레드가 안전(Thread Safe)하다

### LinkedList
- List 구현 클래스이므로 ArrayList와 사용 방법은 똑같지만 내부 구조는 완전 다름
- ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조 링크를 해서 체인처럼 관리
- 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않음(삽입도 마찬가지)


</br>
</br>

# Set 컬렉션
- List 컬렉션은 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않음
- 객체를 중복해서 저장할 수 없고 하나의 null만 저장 가능 (수학의 집합과 유사)
- 들어갈(저장할) 때의 순서와 나올(찾을) 때의 순서가 다를 수 있음

</br>

Set 컬렉션에는 HashSet, LinkedHashSet, TreeSet 등이 있으며, 다음은 Set 컬렉션에서 공통적으로 사용 가능한 Set 인터페이스의 메소드들이다.

</br>

## **Q8 Set Collection Methods**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가||주어진 객체를 저장,</br>성공적으로 저장되면 true</br>중복 객체면 false 리턴|
|객체 검색|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
|객체 검색||컬렉션이 비어 있는지 조사|
|객체 검색|Iterator<E> iterator()|저장된 객체를 한 번씩 가져오는 반복자 리턴|
|객체 검색||저장되어 있는 전체 객체 수 리턴|
|객체 삭제||저장된 모든 객체를 삭제|
|객체 삭제|boolean remove(Object o)|주어진 객체를 삭제|

</br>

**정답:**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가|boolean add(E e)|주어진 객체를 저장,</br>성공적으로 저장되면 true</br>중복 객체면 false 리턴|
|객체 검색|boolean contains(Object o)|주어진 객체가 저장되어 있는지 여부|
|객체 검색|boolean isEmpty()|컬렉션이 비어 있는지 조사|
|객체 검색|Iterator<E> iterator()|저장된 객체를 한 번씩 가져오는 반복자 리턴|
|객체 검색|int size()|저장되어 있는 전체 객체 수 리턴|
|객체 삭제|void clear()|저장된 모든 객체를 삭제|
|객체 삭제|boolean remove(Object o)|주어진 객체를 삭제|

</br>
</br>

# Map 컬렉션
- Map 컬렉션은 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있음(키와 값은 모두 객체)
- 키는 중복 저장될 수 없지만 값은 중복 저장될 수 있음
- 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치됨

</br>

Map 컬렉션에는 HashMap, Hashtable, LinkedHashMap, Properties, TreeMap 등이 있으며, 다음은 Map 컬렉션에서 공통적으로 사용 가능한 메소드들이다.

</br>

## **Q9 Map Collection Methods**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가||주어진 키로 값을 저장, 새로운 키일 경우 null,</br>동일한 키가 있을 경우  값을 대체하고 이전 값 리턴|
|객체 검색|boolean containsKey(Object key)|주어진 키가 있는지 여부|
|객체 검색|boolean containsValue(Object value)|주어진 값이 있는지 여부|
|객체 검색|Set<Map.Entry<K.V>> entrySet()|키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set 담아서 리턴|
|객체 검색||주어진 키가 있는 값을 리턴|
|객체 검색|boolean isEmpty()|컬렉션이 비어 있는지 여부|
|객체 검색|Set<K> keySet()|모든 키를 Set 객체에 담아서 리턴|
|객체 검색|int size()|저장된 키의 총 수를 리턴|
|객체 검색|Collection<V> values()|저장된 모든 값을 Collection에 담아서 리턴|
|객체 삭제|viod clear()|모든 Map.Entry(키와 값)를 삭제|
|객체 삭제|V remove(Object key)|주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴|

</br>

**정답:**
|기능|메소드|설명|
|:---:|:---:|:---:|
|객체 추가|V put(K key, V value)|주어진 키로 값을 저장, 새로운 키일 경우 null,</br>동일한 키가 있을 경우  값을 대체하고 이전 값 리턴|
|객체 검색|boolean containsKey(Object key)|주어진 키가 있는지 여부|
|객체 검색|boolean containsValue(Object value)|주어진 값이 있는지 여부|
|객체 검색|Set<Map.Entry<K.V>> entrySet()|키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set 담아서 리턴|
|객체 검색|V get(Object key)|주어진 키가 있는 값을 리턴|
|객체 검색|boolean isEmpty()|컬렉션이 비어 있는지 여부|
|객체 검색|Set<K> keySet()|모든 키를 Set 객체에 담아서 리턴|
|객체 검색|int size()|저장된 키의 총 수를 리턴|
|객체 검색|Collection<V> values()|저장된 모든 값을 Collection에 담아서 리턴|
|객체 삭제|viod clear()|모든 Map.Entry(키와 값)를 삭제|
|객체 삭제|V remove(Object key)|주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴|
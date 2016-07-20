#!/bin/bash

x=( 'Negative' 'Zero' 'Positive' )
y=( -10 0 10 )
z1=( 'INVALID' 'TAKE' 'VALID' )
z2=( 'invalid' 'take' 'valid' )

# Constructor
for a in 0 1 2; do
  for b in 0 1 2; do
    for c in 0 1 2; do
      for d in 0 1 2; do
      	echo '    @Test'
      	echo '    public void constructorWithSourceXIs'${x[a]}'AndSourceYIs'${x[b]}'AndDestinationXIs'${x[c]}'AndDestinationYIs'${x[d]}'()'
      	echo '    {'
      	echo '        Move move = new Move('${y[a]}', '${y[b]}', '${y[c]}', '${y[d]}');'
      	echo '        assertEquals('${y[a]}', move.getSource().getX());'
      	echo '        assertEquals('${y[b]}', move.getSource().getY());'
      	echo '        assertEquals('${y[c]}', move.getDestination().getX());'
      	echo '        assertEquals('${y[d]}', move.getDestination().getY());'
      	echo '        assertEquals(MoveState.INVALID, move.getMoveState());'
      	echo '    }'
      	echo ''
      done
    done
  done
done

# GetSource
for a in 0 1 2; do
  for b in 0 1 2; do
    echo '    @Test'
    echo '    public void sourceXIs'${x[a]}'AndYIs'${x[b]}'()'
    echo '    {'
    echo '        Move move = new Move('${y[a]}', '${y[b]}', 0, 0);'
    echo '        assertEquals('${y[a]}', move.getSource().getX());'
    echo '        assertEquals('${y[b]}', move.getSource().getY());'
    echo '    }'
    echo ''
  done
done 

# GetDestination
for a in 0 1 2; do
  for b in 0 1 2; do
    echo '    @Test'
    echo '    public void destinationXIs'${x[a]}'AndYIs'${x[b]}'()'
    echo '    {'
    echo '        Move move = new Move(0, 0, '${y[a]}', '${y[b]}');'
    echo '        assertEquals('${y[a]}', move.getDestination().getX());'
    echo '        assertEquals('${y[b]}', move.getDestination().getY());'
    echo '    }'
    echo ''
  done
done 

# Set/GetMoveState
for a in 0 1 2; do
  echo '    @Test'
  echo '    public void '${z2[a]}'Move()'
  echo '    {'
  echo '        Move move = new Move(0, 0, 0, 0);'
  echo '        move.setMoveState(MoveState.'${z1[a]}');'
  echo '        assertEquals(MoveState.'${z1[a]}', move.getMoveState());'
  echo '    }'
  echo ''  
done

exit 0
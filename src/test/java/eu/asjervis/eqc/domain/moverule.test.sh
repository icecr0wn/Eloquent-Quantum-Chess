#!/bin/bash

moveState=( 'INVALID' 'TAKE' 'VALID' )
shouldStop=( 'True' 'True' 'False' )
moveStateText=( 'Invalid' 'Take' 'Valid' )
boardStatus=( 'LeftOutside' 'RightOutside' 'UpOutside' 'DownOutside' 'On')
isOnBoard=( 'False' 'False' 'False' 'False' 'True' )
boardValuesX=( -1 9 4 4 4)
boardValuesY=( 4 4 9 -1 4)

# isOnBoard
for i in 0 1 2 3 4; do
  echo '    @Test'
  echo '    public void positionIs'${boardStatus[$i]}'Board()'
  echo '    {'
  echo '        assert'${isOnBoard[$i]}'(new TestMoveRule().isOnBoard(new Position('${boardValuesX[$i]}', '${boardValuesY[$i]}')));'
  echo '    }'
  echo ''
done

# processMove
for i in 0; do
  echo '    @Test'
  echo '    public void processMove()'
  echo '    {'
  echo '        System.out.println("#### @todo THIS TEST NEEDS IMPLEMENTING. See moverule.test.sh");'
  echo '    }'
  echo ''
done

# shouldStop
for i in 0 1 2; do
  echo '    @Test'
  echo '    public void shouldWeStopWith'${moveStateText[$i]}'Move()'
  echo '    {'
  echo '        assert'${shouldStop[$i]}'(new TestMoveRule().shouldStop(MoveState.'${moveState[$i]}'));'
  echo '    }'
  echo ''
done

exit 0
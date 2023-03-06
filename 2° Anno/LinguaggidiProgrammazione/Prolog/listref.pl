%! listref(L, N, E) is semidet.
%
%Il predicato è vero quando E è l'elemento nella posizione N-esima di L

listref([E | _], 0, E),
    !.
listref([_ | Es], N, E) :-
    N > 0,
    !,
    N1 is N - 1,
    listref(Es, N1, E).

%!   part(E, L) is nondet.
%
%   Il predicato è vero quando E è elemento della lista L
%

part(E, [E | _]).
part(E, [_ | Es]) :-
    part(E, Es).


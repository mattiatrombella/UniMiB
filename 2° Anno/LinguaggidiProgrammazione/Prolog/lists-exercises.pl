%! appendi(L1, L2, L3) is nondet.
%    Il predicato è vero quando la lista L3 è la concatenazione di L1 e
%    L2

appendi([], L2, L2).
appendi([X | Xs], Ys, [X | Zs]) :-
    appendi(Xs, Ys, Zs).


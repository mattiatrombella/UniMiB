;;; commento su lisp
;;; fact.lisp

(defun fact (x) 
  (if (zerop x)
      1
  (* x (factorial (- x 1)))))

(defun fact-acc (x acc)
  (if (zerop x)
      acc
    (fact-acc (- x 1) (* x acc))))





;;; end of file

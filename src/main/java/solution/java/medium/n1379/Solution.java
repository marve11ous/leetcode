package solution.medium.n1379;

import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * <a href="https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/">1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree</a>
 */
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        var queue = new LinkedList<Map.Entry<TreeNode, TreeNode>>();
        queue.offer(Map.entry(original, cloned));
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- >= 0) {
                var pair = Objects.requireNonNull(queue.poll());
                if (pair.getKey() == target) {
                    return pair.getValue();
                }
                Optional.ofNullable(pair.getKey()).map(node -> node.left)
                        .ifPresent(left -> queue.offer(Map.entry(left, pair.getValue().left)));
                Optional.ofNullable(pair.getKey()).map(node -> node.right)
                        .ifPresent(right -> queue.offer(Map.entry(right, pair.getValue().right)));
            }
        }
        return null;
    }

}


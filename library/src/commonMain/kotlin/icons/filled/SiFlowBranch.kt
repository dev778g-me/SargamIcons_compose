package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlowBranch: ImageVector
    get() {
        if (_SiFlowBranch != null) {
            return _SiFlowBranch!!
        }
        _SiFlowBranch = ImageVector.Builder(
            name = "Filled.SiFlowBranch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveTo(8f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.825f)
                verticalLineToRelative(2.33f)
                curveToRelative(0f, 2.19f, -1.705f, 4.076f, -3.91f, 4.076f)
                horizontalLineTo(9.91f)
                curveToRelative(-0.996f, 0f, -1.91f, 0.883f, -1.91f, 2.077f)
                verticalLineToRelative(1.866f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                arcToRelative(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 5.825f)
                verticalLineToRelative(4.925f)
                curveToRelative(0.56f, -0.33f, 1.21f, -0.52f, 1.91f, -0.52f)
                horizontalLineToRelative(4.18f)
                curveToRelative(0.996f, 0f, 1.91f, -0.882f, 1.91f, -2.076f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _SiFlowBranch!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlowBranch: ImageVector? = null

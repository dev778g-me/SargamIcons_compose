package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlowCascade: ImageVector
    get() {
        if (_SiFlowCascade != null) {
            return _SiFlowCascade!!
        }
        _SiFlowCascade = ImageVector.Builder(
            name = "Filled.SiFlowCascade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(0f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveTo(8f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.825f)
                verticalLineTo(9f)
                curveToRelative(0f, 1.706f, 1.303f, 3f, 2.765f, 3f)
                horizontalLineToRelative(3.409f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.826f, 1f)
                horizontalLineToRelative(-3.41f)
                curveToRelative(-1.04f, 0f, -1.99f, -0.35f, -2.764f, -0.933f)
                verticalLineTo(16f)
                curveToRelative(0f, 1.706f, 1.303f, 3f, 2.765f, 3f)
                horizontalLineToRelative(3.409f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.826f, 1f)
                horizontalLineToRelative(-3.41f)
                curveTo(8.087f, 21f, 6f, 18.694f, 6f, 16f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _SiFlowCascade!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlowCascade: ImageVector? = null

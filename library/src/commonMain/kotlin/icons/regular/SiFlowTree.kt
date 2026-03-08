package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFlowTree: ImageVector
    get() {
        if (_SiFlowTree != null) {
            return _SiFlowTree!!
        }
        _SiFlowTree = ImageVector.Builder(
            name = "Regular.SiFlowTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                moveToRelative(0f, 0f)
                verticalLineTo(6f)
                moveToRelative(0f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                moveToRelative(8f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-3.293f)
                curveTo(20f, 13.218f, 18.8f, 12f, 17.333f, 12f)
                horizontalLineTo(6.667f)
                curveTo(5.2f, 12f, 4f, 13.218f, 4f, 14.707f)
                verticalLineTo(18f)
                moveToRelative(0f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            }
        }.build()

        return _SiFlowTree!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlowTree: ImageVector? = null

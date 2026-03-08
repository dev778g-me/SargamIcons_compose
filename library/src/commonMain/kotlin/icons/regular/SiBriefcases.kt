package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBriefcases: ImageVector
    get() {
        if (_SiBriefcases != null) {
            return _SiBriefcases!!
        }
        _SiBriefcases = ImageVector.Builder(
            name = "Regular.SiBriefcases",
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
                moveTo(19f, 22f)
                horizontalLineTo(7.4f)
                curveTo(4.42f, 22f, 2f, 19.58f, 2f, 16.6f)
                verticalLineTo(11f)
                moveToRelative(15f, 8f)
                verticalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineToRelative(-4.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(19f)
                moveTo(7.4f, 6f)
                horizontalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8.4f)
                verticalLineToRelative(8.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(7.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16.6f)
                verticalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 6f)
            }
        }.build()

        return _SiBriefcases!!
    }

@Suppress("ObjectPropertyName")
private var _SiBriefcases: ImageVector? = null

package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBarChart: ImageVector
    get() {
        if (_SiBarChart != null) {
            return _SiBarChart!!
        }
        _SiBarChart = ImageVector.Builder(
            name = "Regular.SiBarChart",
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
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
                moveTo(9f, 8.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.4f, 7f)
                horizontalLineTo(4.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8.6f)
                verticalLineTo(22f)
                moveToRelative(6f, 0f)
                verticalLineTo(3.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, 2f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 3.6f)
                verticalLineTo(22f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(-8.4f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                horizontalLineToRelative(-2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 1.6f)
            }
        }.build()

        return _SiBarChart!!
    }

@Suppress("ObjectPropertyName")
private var _SiBarChart: ImageVector? = null

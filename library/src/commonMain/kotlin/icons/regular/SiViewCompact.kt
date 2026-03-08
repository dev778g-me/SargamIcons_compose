package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiViewCompact: ImageVector
    get() {
        if (_SiViewCompact != null) {
            return _SiViewCompact!!
        }
        _SiViewCompact = ImageVector.Builder(
            name = "Regular.SiViewCompact",
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
                moveTo(7f, 19f)
                verticalLineTo(4f)
                moveToRelative(5f, 15f)
                verticalLineTo(4f)
                moveToRelative(5f, 15f)
                verticalLineTo(4f)
                moveTo(2f, 9f)
                horizontalLineToRelative(20f)
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
                moveTo(4.4f, 4f)
                horizontalLineToRelative(15.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6.4f)
                verticalLineToRelative(10.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16.6f)
                verticalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, 4f)
            }
        }.build()

        return _SiViewCompact!!
    }

@Suppress("ObjectPropertyName")
private var _SiViewCompact: ImageVector? = null

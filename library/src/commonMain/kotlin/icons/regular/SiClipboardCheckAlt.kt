package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiClipboardCheckAlt: ImageVector
    get() {
        if (_SiClipboardCheckAlt != null) {
            return _SiClipboardCheckAlt!!
        }
        _SiClipboardCheckAlt = ImageVector.Builder(
            name = "Regular.SiClipboardCheckAlt",
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
                moveTo(14f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                moveToRelative(4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(4.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                horizontalLineTo(10f)
                moveTo(8f, 14f)
                lineToRelative(3f, 3f)
                lineToRelative(5f, -7f)
            }
        }.build()

        return _SiClipboardCheckAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiClipboardCheckAlt: ImageVector? = null

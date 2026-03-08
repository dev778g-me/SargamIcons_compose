package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAttachment: ImageVector
    get() {
        if (_SiAttachment != null) {
            return _SiAttachment!!
        }
        _SiAttachment = ImageVector.Builder(
            name = "Regular.SiAttachment",
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
                moveToRelative(19.605f, 10.48f)
                lineToRelative(0.137f, -0.136f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6.086f)
                arcToRelative(4.307f, 4.307f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.086f, 0f)
                lineToRelative(-9.398f, 9.398f)
                arcToRelative(4.307f, 4.307f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.086f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.086f, 0f)
                lineToRelative(6.351f, -6.356f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, -4.008f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 0.688f)
                lineToRelative(-6.657f, 6.656f)
            }
        }.build()

        return _SiAttachment!!
    }

@Suppress("ObjectPropertyName")
private var _SiAttachment: ImageVector? = null
